package org.dstu;

import org.dstu.domain.IFigure;
import org.dstu.domain.Square;
import org.dstu.domain.Rectangle;
import org.dstu.util.CsvReader;
import org.dstu.util.SerializeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify data file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        List<String[]> strings = CsvReader.readCsvFile(sourceFile, ";");
        List<IFigure> people = new ArrayList<>();
        for (String[] line: strings) {
            if (Objects.equals(line[3], line[4])) {
                people.add(new Square(line));
            } else {
                people.add(new Rectangle(line));
            }
        }

        people.forEach(System.out::println);

        SerializeUtils.serialize(people, binFile);
        List<IFigure> newFigures = (List<IFigure>) SerializeUtils.deserialize(binFile);
        System.out.println("Новые фигуры:");
        newFigures.forEach(System.out::println);
    }
}
