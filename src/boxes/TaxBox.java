package boxes;/*
 * 24/3/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to define the tax boxes
 *
 */

public class TaxBox extends Box {
    String typeOfTax;


    // Constructor
    public TaxBox(int idBox, String typeOfBox, String typeOfTax) {
        super(idBox, typeOfBox);
        this.typeOfTax = typeOfTax;
    }

    public String getTypeOfTax() {
        return typeOfTax;
    }

    @Override
    public String toString() {
        return
                "idBox = " + idBox +
                        " -- > type = " + type +
                        " -- > typeOfTax = " + typeOfTax;
    }
}
