module ch.ictbz.rechteck.rechteck {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.ictbz.rechteck.rechteck to javafx.fxml;
    exports ch.ictbz.rechteck.rechteck;
}