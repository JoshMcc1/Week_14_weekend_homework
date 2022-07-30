package shop.items;

import behaviours.ISell;

public class ShopItem implements ISell
{
  private String description;
  private double buyingPrice;
  private double sellingPrice;

  public ShopItem(String description, double buyingPrice, double sellingPrice)
  {
    this.description = description;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public double getBuyingPrice()
  {
    return buyingPrice;
  }

  public void setBuyingPrice(double buyingPrice)
  {
    this.buyingPrice = buyingPrice;
  }

  public double getSellingPrice()
  {
    return sellingPrice;
  }

  public void setSellingPrice(double sellingPrice)
  {
    this.sellingPrice = sellingPrice;
  }

  @Override
  public double calculateMarkup()
  {
    return sellingPrice - buyingPrice;
  }
}
