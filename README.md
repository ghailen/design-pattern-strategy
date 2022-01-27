# design-pattern-strategy

Dans une interface on définit la mathode qu'on veut executer (pay) , selon les different stype de payment on va creer des classes qui vont implementer l'interface PayStrategy,
on va creer un context qui va contenir un champs de type strategy(l'interface payStrategy) et une methode executepayment()  qui va faire appel à cette maethode pay() qui est implemété par les classes.
et enfin on va creer une classe main qui execute le design pattern

![image](https://user-images.githubusercontent.com/36199753/151373627-1562d307-3526-4b62-befd-73a9e293f55c.png)


![image](https://user-images.githubusercontent.com/36199753/151373283-91757ce3-f356-4299-acfe-5051d98a7d0f.png)
