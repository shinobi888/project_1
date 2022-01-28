package models;

public class AppModel {
    public int id;
    String field_1;
    String field_2;
    String field_3;


    AppModel(){

    }
    AppModel(int id, String f1, String f2, String f3){

    }
    AppModel(String f1, String f2, String f3){

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getField_1() {
        return field_1;
    }
    public void setField_1(String title) {
        this.field_1 = field_1;
    }

    public String getField_2 () {
        return field_2;
    }
    public void setField_2Field_3(double price) {
        this.field_2 =field_2;
    }



    public void setField_3(boolean available) {
        this.field_3 = field_3;
    }

    public String getField_3() {
        return field_3;
    }


}
