package org.dstu.domain;

import java.util.Objects;

public class Rectangle extends Figure {
    private int length;
    private int height;


    public Rectangle() {
    }

    public Rectangle(String[] line) {
        super(Integer.parseInt(line[0]), line[2], line[1]);
        length = Integer.parseInt(line[3]);
        height = Integer.parseInt(line[4]);
         }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (Objects.equals(getLength(), getHeight())) {
            builder.append("");
        } else {
            builder.append(" Прямоугольник: ");
        }
        builder.append(super.toString());
        builder.append(" | Длина: ");
        builder.append(length);
        builder.append(" | Высота: ");
        builder.append(height);
        return builder.toString();
    }
}
