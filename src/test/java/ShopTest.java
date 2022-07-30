import behaviours.ISell;
import instruments.Guitar;
import instruments.GuitarType;
import instruments.InstrumentType;
import instruments.Piano;
import instruments.PianoType;
import instruments.Saxophone;
import instruments.SaxophoneType;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.items.ShopItem;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest
{
  private Shop shop;

  private Guitar guitar;
  private Piano piano;
  private Saxophone sax;
  private ShopItem drumstick;
  private ShopItem sheetMusic;
  private ShopItem guitarStrings;

  @Before
  public void setUp() {
    guitar = new Guitar(InstrumentType.STRING, "Brown", "Wood", "Carter", 209.99, 499.99, GuitarType.SEMI_ACOUSTIC, 5);
    piano = new Piano(InstrumentType.KEYBOARD, "Black", "Wood", "Samsung", 429.99, 999.99, PianoType.ELECTRIC);
    sax = new Saxophone(InstrumentType.WOODWIND, "Gold", "Brass", "Selmer Paris", 679.99, 2059.99, SaxophoneType.TENOR);
    drumstick = new ShopItem("Two x Drumsticks", 4.99, 12.99);
    sheetMusic = new ShopItem("Sheet Music for Piano beginners", 2.99, 10.99);
    guitarStrings = new ShopItem("5x steel guitar strings", 5.99, 18.99);
    ArrayList<ISell> stock = new ArrayList<>();
    stock.add(guitar);
    stock.add(piano);
    stock.add(sax);
    stock.add(drumstick);
    stock.add(sheetMusic);
    shop = new Shop(stock);
  }

  @Test
  public void canRemoveItemFromStock() {
    shop.removeFromStock(sheetMusic);
    assertEquals(4, shop.getStock().size());
  }

  @Test
  public void canAddItemToStock() {
    shop.addToStock(guitarStrings);
    assertEquals(6, shop.getStock().size());
  }

  @Test
  public void canCalculateTotalMarkupOfAllItemsInStock() {
    assertEquals(2256.00, shop.totalMarkup(), 0.0);
  }


}
