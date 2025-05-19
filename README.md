# SI_2025_lab2_233099
Mila Pandileska 233099

2. https://drive.google.com/file/d/1jxEauDGdmZ0nVkPg4gnbMfkCG_yPZG_b/view?usp=sharing
3. Ciklomatskata kompleksnost e 9, presmetav po brojot na predikatni jazli + 1


4.
  1, 2                                                                | T          | allItems()=null
  1, 3.1, 3.2, 4, 5                                                   | FTT        | allItems() != null, i < allItems.size(), item.getName() = null
  1, 3.1, (3.2, 4, 6, 7, 8, 9, 3.3), 11, 15                           | FTFTTFF    | allItems() != null, i < allItems.size(), item.getName() != null, items.getPrice() = 400,                                                                                                             items.getDiscount() = 5,  i > allItems.size(), cardNumber = null
  1, 3.1, (3.2, 4, 6, 7, 8, 10, 3.3), 11, 12.1, (12.2, 13, 12.3), 16  | FTFTFFTTFF | allItems() != null, i < allItems.size(), item.getName() != null, items.getPrice() = 400,                                                                                                             items.getDiscount() = 0,  i > allItems.size(), cardNumber != null && carNumber.lenght() == 16,                                                                                                       i < carNumber.lenght(), allowed.indexOf(c) != -1, i > carNumber.lenght()
  1, 3.1, (3.2, 4, 6, 7, 8, 10, 3.3), 11, 12.1, 12.2, 13, 14          | FTFTFFTTT  |allItems() != null, i < allItems.size(), item.getName() != null, items.getPrice() = 400,                                                                                                             items.getDiscount() = 0,  i > allItems.size(), cardNumber != null && carNumber.lenght() == 16,                                                                                                       i < carNumber.lenght(), allowed.indexOf(c) == -1

  -potrebni se barem 5 test sluchai za Every Statement kriterioumot

5. if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)

  TXX  item.getPrice() = 400
  FTX  item.getPrice() = 200, item.getDiscount() = 5
  FFT  item.getPrice() = 200, item.getDiscount() = 0,  item.getQuantity() = 20
  FFF  item.getPrice() = 200, item.getDiscount() = 0,  item.getQuantity() = 5

  -potrebno se barem 4 test sluchai za Multiple Condition kriteriumot
