module FinanceControl {
    requires javafx.fxml;
    requires javafx.controls;
    requires sqlite.jdbc;
    requires java.sql;
    requires java.prefs;
    requires java.desktop;

    opens sample;
}