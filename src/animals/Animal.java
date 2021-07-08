package animals;

import foods.Food;

public abstract class Animal {
//region Members.
    private String m_name = "No face, no naaaame, no number";
    private int m_prettiness = 100, m_satiety = 100;
    protected static final int s_MIN_PRETTINESS = 0, s_MAX_PRETTINESS = 100;
    protected static final int s_MIN_SATIETY = 0, s_MAX_SATIETY = 100;
//    private int hash;
//endregion
//region Getters and setters.
    public String getName() { return m_name; }

    protected void setName(final String name) { m_name = name; }

    public int getPrettiness() { return m_prettiness; }

    protected final void setPrettiness(final int prettiness) { m_prettiness = setValueInRange(prettiness, s_MIN_PRETTINESS, s_MAX_PRETTINESS); }

    public int getSatiety() { return m_satiety; }

    protected final void setSatiety(final int satiety) { m_satiety = setValueInRange(satiety, s_MIN_SATIETY, s_MAX_SATIETY); }
//endregion
    public Animal() {}

    public Animal(final String name) { m_name = name; }

    public Animal(final String name, final int prettiness, final int satiety) {
        m_name = name;
        m_prettiness = prettiness;
        m_satiety = satiety;
    }
//region Methods.
    public abstract void eat(final Food food);

    // newValue < min ? min : newValue > max ? max : newValue.
    private int setValueInRange(final int newValue, final int min, final int max) { return Math.min(Math.max(newValue, min), max); }

    protected void addSatiety(final int satiety) { setSatiety(m_satiety + satiety); }

    protected void spendEnergy() {
        spendEnergy(10);
    }

    protected void spendEnergy(int coefficient) {
        int value = (int)(Math.random() * Math.abs(coefficient));
        setSatiety(Math.max(m_satiety - value, 0));
//        System.out.println("Animal have now " + m_satiety + " satiety.");
    }
//endregion
}
//    Хищники.
//            Fish
//            Tiger
//Wolf
//
//        Травоядные.
//        Duck
//        Elephant
//        Horse