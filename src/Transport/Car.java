package Transport;

public class Car extends Transport{

        private double engineVolume;
        private String transmission;
        private final String bodyType;
        private String registrationNumber;
        private final int numberOfSeats;
        
        public Car(double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats,
                   String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
            super(brand, model, productionYear, productionCountry, color, maxSpeed);

            this.bodyType = (bodyType == null || bodyType.isBlank()) ? "custom" : bodyType;
            this.numberOfSeats = (numberOfSeats <=0 ) ? 4 : numberOfSeats;
            this.setEngineVolume(engineVolume);
            this.setTransmission(transmission);
            this.setRegistrationNumber(registrationNumber);

        }

        public void setEngineVolume(double engineVolume) {
            this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
        }
        public void setTransmission(String transmission) {
            this.transmission = (transmission == null || transmission.isBlank()) ? "top secret" : transmission;
        }
        public void setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = (registrationNumber == null || registrationNumber.isBlank())
                    ? "а000аа49" : registrationNumber;
        }

        public String getCarBodyType() {
            return bodyType;
        }
        public int getNumberOfSeats() {
            return numberOfSeats;
        }
        public double getEngineVolume() {
            return engineVolume;
        }
        public String getTransmission() {
            return transmission;
        }
        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public class Key {

            private final int unlock;
            private final int engineOperation;

            public Key (int unlock, int engineOperation) {
                this.unlock = (unlock != 0 && unlock != 1) ? 0 : unlock;
                this.engineOperation = (engineOperation != 0 && engineOperation != 1) ? 0 : engineOperation;
            }
            void operation (){
                if (this.unlock == 0) System.out.println("\t Двери закрыты.");
                if (this.unlock == 1) System.out.println("\t Двери открыты.");
                if (this.engineOperation == 0 ) System.out.println("\t Двигатель заглушен.");
                if (this.engineOperation == 1) System.out.println("\t Двигатель заведён.");
            }
        }

        public String changeTires (int month) {
            if (month >= 4 && month <= 11) {
                return "летние шины";
            } else {
                if (month <= 0 || month > 12) {
                    return "всесезонные шины";
                } else {
                    return "зимние шины";
                }
            }
        }

        public String toString () {
            return "__________________" + '\n' + "\t объем двигателя - " + engineVolume + " л.\n" + "\t коробка передач - " + transmission
                    + "\n" + "\t кузов - " + bodyType + "\n" + "\t регистрационный номер - " + registrationNumber + "\n" + "\t количество мест - " + numberOfSeats
                    + "." + "\n" + getBrand() + " " + getModel() + '\n' + "\t цвет - " + getColor() + ".\n" + "\t год выпуска - " + getProductionYear()
                    + " г.\n" + "\t страна сборки - " + getProductionCountry() + ".";
        }

        public void unlockStarted () {
            Key key = new Key(0,0);
            key.operation();
        }
    }

