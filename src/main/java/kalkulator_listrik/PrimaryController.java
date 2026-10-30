package kalkulator_listrik;

import kalkulator_listrik.model.Appliance;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField nameField;
    @FXML private TextField wattField;
    @FXML private TextField hoursField;
    
    @FXML private Label resultValueLabel;
    @FXML private Label resultSubLabel;

    @FXML
    private void handleCalculate() {
        String name = nameField.getText().trim();
        String wattText = wattField.getText().trim();
        String hoursText = hoursField.getText().trim();

        if (name.isEmpty() || wattText.isEmpty() || hoursText.isEmpty()) {
            resultValueLabel.setText("Data Belum Lengkap");
            resultSubLabel.setText("Harap isi semua kolom input di atas.");
            return;
        }

        try {
            double watt = Double.parseDouble(wattText);
            double hours = Double.parseDouble(hoursText);

            if (watt <= 0 || hours <= 0 || hours > 24) {
                resultValueLabel.setText("Input Tidak Valid");
                resultSubLabel.setText("Daya & Jam harus > 0 (Maks 24 jam/hari).");
                return;
            }

            Appliance appliance = new Appliance(name, watt, hours);
            double monthlyCost = appliance.calculateMonthlyCost(1444.70);
            double monthlyKwh = appliance.getMonthlyKwh();

            resultValueLabel.setText(String.format("Rp %,.2f / bulan", monthlyCost));
            resultSubLabel.setText(String.format("Estimasi konsumsi %s: %.2f kWh / bulan", name, monthlyKwh));

        } catch (NumberFormatException e) {
            resultValueLabel.setText("Error Input");
            resultSubLabel.setText("Kolom Daya dan Jam harus berupa angka!");
        }
    }
}