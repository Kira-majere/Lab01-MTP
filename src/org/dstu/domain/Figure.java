package org.dstu.domain;

public abstract class Figure implements IFigure {
    private int angles;
    private String colorLine;
    private String fillColor;

    public Figure() {
    }

    public Figure(int angles, String colorLine, String fillColor) {
        this.angles = angles;
        this.colorLine = colorLine;
        this.fillColor = fillColor;
    }

       public Figure(String[] line) {
        fillColor = line[1];
        angles = Integer.parseInt(line[0]);
        colorLine = line[2];
    }

    public int getAngles() {
        return angles;
    }

    public void setAngles(int angles) {
        this.angles = angles;
    }

    public String getColorLine() {
        return colorLine;
    }

    public void setColorLine(String colorLine) {
        this.colorLine = colorLine;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Количество углов: ");
        builder.append(angles);
        builder.append(" | Цвет линии: ");
        builder.append(colorLine);
        builder.append(" | Цвет заливки: ");
        builder.append(fillColor);
        return builder.toString();
    }
}
