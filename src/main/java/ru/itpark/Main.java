package ru.itpark;

public class Main {
    public static void main(String[] args) {
        Burger longerBBQ = new Burger();
        longerBBQ.id = 1018;
        longerBBQ.name = "Лонгер BBQ";
        longerBBQ.imageUrl = "https://s82079.cdn.ngenix.net/sRrSzWpf86c4hMMwCJ7aHBph.png?dw=230";
        longerBBQ.cost = 50;
        longerBBQ.weightPerGramm = 107;
        longerBBQ.description = "Сочная курочка, маринованные огурчики, лук и аппетитный соус барбекю! Спешите попробовать!";
        longerBBQ.energyValueCalorie = 236;
        longerBBQ.proteinQuantity = 9.7;
        longerBBQ.fatQuantity = 7.1;
        longerBBQ.carbohydrateQuantity = 33.3;

        Burger cheeseburger = new Burger();
        cheeseburger.id = 2336;
        cheeseburger.name = "Чизбургер";
        cheeseburger.imageUrl = "https://s82079.cdn.ngenix.net/9VW3RQfY33AnJi7Yu38nKiHc.png?dw=230";
        cheeseburger.cost = 69;
        cheeseburger.weightPerGramm = 167;
        cheeseburger.description = "Пряный горчичный соус, кетчуп, сочные стрипсы в оригинальной панировке, лук, сыр Чеддер, огурцы на пшеничной булочке с кукурузной посыпкой.";
        cheeseburger.energyValueCalorie = 237;
        cheeseburger.proteinQuantity = 13.2;
        cheeseburger.fatQuantity = 8.6;
        cheeseburger.carbohydrateQuantity = 26.6;
    }
}
