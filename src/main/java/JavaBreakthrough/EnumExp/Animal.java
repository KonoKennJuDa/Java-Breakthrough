package JavaBreakthrough.EnumExp;

// Вот так правильно создавать перечисление
public enum Animal {
    DOG("Собака"), CAT("Кот"), FROG("Лягушка"); // Это объекты класса Animal
    // По сути это new Animal("Собака"), только Enum, это делает сам

    private String translation;

    Animal() {

    }

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Перевод на русский язык: " + translation;
    }

}
