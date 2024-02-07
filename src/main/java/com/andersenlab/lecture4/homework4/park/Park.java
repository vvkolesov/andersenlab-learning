package com.andersenlab.lecture4.homework4.park;

public class Park {

    //7. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить
    // информацию об аттракционах, времени их работы и стоимости.
    public Attraction getAttraction(Attraction attraction) {
        return attraction;
    }

    public class Attraction {
        private String attractionName;
        private String attractionWorkingHours;
        private int attractionCost;

        public Attraction(String attractionName, String attractionWorkingHours, int attractionCost) {
            this.attractionName = attractionName;
            this.attractionWorkingHours = attractionWorkingHours;
            this.attractionCost = attractionCost;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public void setAttractionName(String attractionName) {
            this.attractionName = attractionName;
        }

        public String getAttractionWorkingHours() {
            return attractionWorkingHours;
        }

        public void setAttractionWorkingHours(String attractionWorkingHours) {
            this.attractionWorkingHours = attractionWorkingHours;
        }

        public int getAttractionCost() {
            return attractionCost;
        }

        public void setAttractionCost(int attractionCost) {
            this.attractionCost = attractionCost;
        }
    }
}
