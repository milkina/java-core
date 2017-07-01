package javadoc;

/**
 * Класс служит для хранения объектов со свойствами
 * <b>maker</b> и <b>price</b>.
 *
 * @version 1.0
 * @author Tatyana
 */
class Product {
    /**
     * Свойство - производитель
     */
    private String maker;

    /**
     * Свойство - цена
     */
    public double price;

    /**
     * Создает новый пустой объект
     *
     * @see Product#Product(String, double)
     */
    Product() {
        setMaker("");
        price = 0;
    }

    /**
     * Создает новый объект с заданными значениями
     *
     * @param maker - производитель
     * @param price - цена
     * @see Product#Product()
     */
    Product(String maker, double price) {
        this.setMaker(maker);
        this.price = price;
    }

    /**
     * Функция для получения значения поля {@link Product#maker}
     *
     * @return Возвращает название производителя
     */
    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}