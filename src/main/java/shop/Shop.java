package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop
{
  private ArrayList<ISell> stock;

  public Shop(ArrayList<ISell> stock)
  {
    this.stock = stock;
  }

  public ArrayList<ISell> getStock()
  {
    return stock;
  }

  public void setStock(ArrayList<ISell> stock)
  {
    this.stock = stock;
  }

  public void addToStock(ISell item) {
    this.stock.add(item);
  }

  public void removeFromStock(ISell item) {
    this.stock.remove(item);
  }

  public double totalMarkup() {
    double totalMarkup = 0.0;
    for (ISell item : stock) {
      double currentItemMarkup = item.calculateMarkup();
      totalMarkup += currentItemMarkup;
    }
    return totalMarkup;
  }
}
