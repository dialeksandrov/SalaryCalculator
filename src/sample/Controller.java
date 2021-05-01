package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {


    @FXML
    private JFXTextField pt2600;

    @FXML
    private JFXTextField pt2100;

    @FXML
    private JFXTextField pt1600;

    @FXML
    private JFXTextField pt1500;

    @FXML
    private JFXTextField pt1200;

    @FXML
    private JFXTextField sek8000;

    @FXML
    private JFXTextField sek7000;

    @FXML
    private JFXTextField sek6000;

    @FXML
    private JFXTextField dejurstva;

    @FXML
    private JFXTextField instruktaj;

    @FXML
    private JFXComboBox<String> cbMonths;

    @FXML
    private JFXComboBox<Integer> cbProcent;

    @FXML
    private JFXButton txtSalary;

    @FXML
    private JFXButton btnCancel;

    @FXML
    private JFXButton btnStatistic;

    @FXML
    void btnCancelClicked(ActionEvent event) {

    }

    @FXML
    void btnSalaryClicked(ActionEvent event) {
        int p2600 = Integer.parseInt(pt2600.getText());
        int p2100 = Integer.parseInt(pt2100.getText());
        int p1600 = Integer.parseInt(pt1600.getText());
        int p1500 = Integer.parseInt(pt1500.getText());
        int p1200 = Integer.parseInt(pt1200.getText());
        int s8000 = Integer.parseInt(sek8000.getText());
        int s7000 = Integer.parseInt(sek7000.getText());
        int s6000 = Integer.parseInt(sek6000.getText());
        int dej = Integer.parseInt(dejurstva.getText());
        int oi = Integer.parseInt(instruktaj.getText());
        Integer proc = cbProcent.getSelectionModel().getSelectedItem();
        String month = cbMonths.getSelectionModel().getSelectedItem();
        int ptSum = (((p2600 * 2600) + (p2100 * 2100) + (p1600 * 1600) +
                (p1500 * 1500) + (p1200 * 1200)) / 100) * proc;
        int sekSum = (((s8000 * 8000) + (s7000 * 7000) + (s6000 * 6000)) / 100) * proc;
        int dejSum = dej * 100;
        int oiSum = oi * 350;
        double result = (int)((ptSum + sekSum + dejSum + oiSum) * 0.97) - 2200;
        System.out.println(result);
    }

    @FXML
    void btnStatisticClicked(ActionEvent event) {

    }

    @FXML
    void initialize() {
        initCbMonths();
        initProcentBox();
    }
    private void initCbMonths(){
        List<String> months = new ArrayList<>();
        months.add("Январь");
        months.add("Февраль");
        months.add("Март");
        months.add("Апрель");
        months.add("Май");
        months.add("Июнь");
        months.add("Июль");
        months.add("Август");
        months.add("Сентябрь");
        months.add("Октябрь");
        months.add("Ноябрь");
        months.add("Девабрь");
        cbMonths.setItems(FXCollections.observableArrayList(months));
    }
    private void initProcentBox(){
        List<Integer> procents = new ArrayList<>();
        procents.add(30);
        procents.add(35);
        procents.add(40);
        procents.add(45);
        cbProcent.setItems(FXCollections.observableArrayList(procents));
    }
    
}
