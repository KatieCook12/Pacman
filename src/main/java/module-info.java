module com.example.practice_login_and_registration_page {
    requires javafx.controls;
    requires javafx.fxml;


    opens Pac_Man to javafx.fxml;
    exports Pac_Man;
}