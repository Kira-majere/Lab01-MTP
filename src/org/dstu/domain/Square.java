package org.dstu.domain;

import java.util.Objects;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(String[] line) {
        super.setAngles(Integer.parseInt(line[0]));
        super.setColorLine(line[1]);
        super.setFillColor(line[2]);
        super.setLength(Integer.parseInt(line[3]));
        super.setHeight(Integer.parseInt(line[4]));
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(" Квадрат: ");
        builder.append(super.toString());

        return builder.toString();
    }
}
