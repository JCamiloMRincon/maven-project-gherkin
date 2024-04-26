package entities;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("productos")
public class Product {

    @ExcelCellName("NOMBRE")
    private String name;
    @ExcelCellName("PRECIO")
    private double price;
    @ExcelCellName("STOCK")
    private double stock;
    @ExcelCellName("PESO")
    private double weight;
    @ExcelCellName("PERECIBLE")
    private boolean isPerishable;
    @ExcelCellName("VOLUMEN")
    private double volume;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getStock() {
        return stock;
    }

    public boolean isPerishable() {
        return isPerishable;
    }

    public double getVolume() {
        return volume;
    }
}
