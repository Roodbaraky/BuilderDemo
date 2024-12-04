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

    public Subway(SubwayBuilder builder) {

    }

}
