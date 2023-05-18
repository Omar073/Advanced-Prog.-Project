import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AdminGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        Label adminLabel = new Label("Admin Page");
        adminLabel.setLayoutX(247.0);
        adminLabel.setLayoutY(14.0);
        adminLabel.setPrefSize(177.0, 45.0);
        adminLabel.setStyle("-fx-background-color: black;");
        adminLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        adminLabel.setAlignment(javafx.geometry.Pos.CENTER);
        adminLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        adminLabel.setFont(new Font(20.0));
        adminLabel.setEffect(new ColorAdjust());

        Button addBookButton = new Button("Add new book");
        addBookButton.setLayoutX(72.0);
        addBookButton.setLayoutY(91.0);

        Button removeBookButton = new Button("Remove a book");
        removeBookButton.setLayoutX(286.0);
        removeBookButton.setLayoutY(91.0);
        removeBookButton.setOnAction(event -> {
            SearchBooksGUI searchbooksGUI = new SearchBooksGUI("admin");
            Stage searchbooksstage = new Stage();
            searchbooksGUI.start(searchbooksstage);
            primaryStage.close();
        });

        Button updateBookButton = new Button("Update a book");
        updateBookButton.setLayoutX(498.0);
        updateBookButton.setLayoutY(91.0);

        Button addUserButton = new Button("Add new user");
        addUserButton.setLayoutX(74.0);
        addUserButton.setLayoutY(157.0);

        Button removeUserButton = new Button("Remove a user");
        removeUserButton.setLayoutX(288.0);
        removeUserButton.setLayoutY(157.0);
        removeUserButton.setOnAction(event -> {
            SearchUsersGui searchusersGUI = new SearchUsersGui("admin");
            Stage searchusersstage = new Stage();
            searchusersGUI.start(searchusersstage);
            primaryStage.close();
        });

        Button updateUserButton = new Button("Update a user");
        updateUserButton.setLayoutX(500.0);
        updateUserButton.setLayoutY(157.0);

        Button viewBooksButton = new Button("View all books");
        viewBooksButton.setLayoutX(73.0);
        viewBooksButton.setLayoutY(225.0);
        viewBooksButton.setOnAction(event -> {
            DisplayListGUI displayListGUI = new DisplayListGUI(Library.books);
            Stage displaybooksstage = new Stage();
            displayListGUI.start(displaybooksstage);
            primaryStage.close();
        });
        // displayListGUI.launch(args);

        Button viewUsersButton = new Button("View all users");
        viewUsersButton.setLayoutX(291.0);
        viewUsersButton.setLayoutY(225.0);
        viewUsersButton.setOnAction(event -> {
            DisplayListGUI displayListGUI = new DisplayListGUI(Library.persons);
            Stage displayusersstage = new Stage();
            displayListGUI.start(displayusersstage);
            primaryStage.close();
        });

        Button searchUsersButton = new Button("Search users");
        searchUsersButton.setLayoutX(504.0);
        searchUsersButton.setLayoutY(225.0);
        searchUsersButton.setOnAction(event -> {
            SearchUsersGui searchusersGUI = new SearchUsersGui("admin");
            Stage searchusersstage = new Stage();
            searchusersGUI.start(searchusersstage);
            primaryStage.close();
        });

        Button searchBooksButton = new Button("Search books");
        searchBooksButton.setLayoutX(75.0);
        searchBooksButton.setLayoutY(284.0);
        searchBooksButton.setOnAction(event -> {
            SearchBooksGUI searchbooksGUI = new SearchBooksGUI("admin");
            Stage searchbooksstage = new Stage();
            searchbooksGUI.start(searchbooksstage);
            primaryStage.close();
        });

        Button viewCartButton = new Button("View cart");
        viewCartButton.setLayoutX(302.0);
        viewCartButton.setLayoutY(284.0);

        Button addToCartButton = new Button("Add to cart");
        addToCartButton.setLayoutX(507.0);
        addToCartButton.setLayoutY(284.0);

        Button removeBookFromCartButton = new Button("Remove book from cart");
        removeBookFromCartButton.setLayoutX(72.0);
        removeBookFromCartButton.setLayoutY(340.0);

        Button blockUserButton = new Button("Block user");
        blockUserButton.setLayoutX(510.0);
        blockUserButton.setLayoutY(340.0);

        Button logoutButton = new Button("Logout");
        logoutButton.setLayoutX(307.0);
        logoutButton.setLayoutY(411.0);
        logoutButton.setOnAction(event -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Logout");
            alert.setHeaderText(null);
            // alert.setContentText("Welcome to the Library Management System!");
            alert.setContentText("Logged out successfully!");
            alert.showAndWait();
            System.exit(0);});

        root.getChildren().addAll(adminLabel, addBookButton, removeBookButton, updateBookButton, addUserButton,
                removeUserButton, updateUserButton, viewBooksButton, viewUsersButton, searchUsersButton,
                searchBooksButton, viewCartButton, addToCartButton, removeBookFromCartButton, blockUserButton,
                logoutButton);

        Scene scene = new Scene(root, 687, 474);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}