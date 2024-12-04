package MHR.practice;

import java.util.ArrayList;
import java.util.List;

public class Subway {
    private String bread;
    private List<String> meat;
    private List<String> cheese;
    private List<String> salad;
    private List<String> sauce;

    public static class SubwayBuilder {
        private String bread;
        private List<String> meat = new ArrayList<>();
        private List<String> cheese = new ArrayList<>();
        private List<String> salad = new ArrayList<>();
        private List<String> sauce = new ArrayList<>();

        public SubwayBuilder() {

        }

        public Subway build() {
            return new Subway(this);
        }

        public SubwayBuilder addBread(String bread) {
            this.bread = bread;
            return this;
        }

        public SubwayBuilder addMeat(String meat) {
            this.meat.add(meat);
            return this;
        }

        public SubwayBuilder addCheese(String cheese) {
            this.cheese.add(cheese);
            return this;
        }

        public SubwayBuilder addSalad(String salad) {
            this.salad.add(salad);
            return this;
        }

        public SubwayBuilder addSauce(String sauce) {
            this.sauce.add(sauce);
            return this;
        }

    }

    public String getBread() {
        return bread;
    }

    public List<String> getMeat() {
        return meat;
    }

    public List<String> getCheese() {
        return cheese;
    }

    public List<String> getSalad() {
        return salad;
    }

    public List<String> getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subway Sandwich: ");
        if (bread != null) {
            sb.append("Bread: ").append(bread).append(", ");
        }
        if (!meat.isEmpty()) {
            sb.append("Meat: ").append(String.join(", ", meat)).append(", ");
        }
        if (!cheese.isEmpty()) {
            sb.append("Cheese: ").append(String.join(", ", cheese)).append(", ");
        }
        if (!salad.isEmpty()) {
            sb.append("Salad: ").append(String.join(", ", salad)).append(", ");
        }
        if (!sauce.isEmpty()) {
            sb.append("Sauce: ").append(String.join(", ", sauce)).append(", ");
        }
        if (sb.toString().endsWith(", ")) {
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }

    public Subway(SubwayBuilder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.salad = builder.salad;
        this.sauce = builder.sauce;
    }

}
