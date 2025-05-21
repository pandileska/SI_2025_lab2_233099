# SI_2025_lab2_233099
Mila Pandileska 233099

2. https://drive.google.com/file/d/1jxEauDGdmZ0nVkPg4gnbMfkCG_yPZG_b/view?usp=sharing
3. Ciklomatskata kompleksnost e 9, presmetav po brojot na predikatni jazli + 1


4.-potrebni se barem 5 test sluchai za Every Statement kriterioumot
  1. so prviot test primer se frla RuntimeExceptions za lista koja e null, odnosno allItems = null, cardNumber = ""
  tuka se izminuvaat 1,2,17

  2. za vtoriot test primer pravam 2 objekti od tip Item na edniot Name mu go setiram za null, za da go frli RunTimeException za invalid item,
  tuka se izminuvaat 1, 3.1, 3.2, 4, 5

  3. za tretiot test dvata objekti pominuvaat niz for loopot za sum, no cardnumber = null za da go frli sledniot RuntimeException za Invalid cardnumber,
  tuka se izminuvaat 1, 3.1, 3.2, 3.3, 4, 6, 7 ,8, 9 ,10, 11, 15, 17
     (se izminuvaat i 9 i 10 so toa shto edniot objekt go ispolnuva edniot uslov a drugiot objekt go ispolnuva drugiot uslov)

  4. za chetvrtiot test primer vo cardnumber stavam i eden char znak za da go frli Runtimeexception za Invalid character ,
    tuka se izminuvaat 1, 3.1, 3.2, 3.3, 4, 6, 7 ,8, 9 ,10, 11, 12.1, 12.2, 12.3, 13, 14, 17

  5. i za posledniot test primer davam lista od validni objekti i validen cardnumber za da dobijam ochekuvam sum so assertEquals
    tuka se izminuvaat  1, 3.1, 3.2, 3.3, 4, 6, 7 ,8, 9 ,10, 11, 12.1, 12.2, 12.3, 13, 16, 17

5. if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10) 
   -potrebno se barem 4 test sluchai za Multiple Condition kriteriumot,
  pravam objekt so prvichni properties price = 102, discount = 0, quantity = 0, i pred sekoj test gi menuvam soodvetno so set metodite



    T || X || X  item.getPrice() = 301 ;
    F || T || X  item.getPrice() = 100, item.getDiscount() = 0.1 ;
    F || F || T  item.getPrice() = 100, item.getDiscount() = 0,  item.getQuantity() = 11;
    F || F || F  item.getPrice() = 100, item.getDiscount() = 0,  item.getQuantity() = 5;

  
