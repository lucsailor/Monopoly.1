public class Street_initial {
    public static void main(String[] args){
        int[] a = new int[0];



    }

    public static void streetInitial (){
        Player.Streets[0] = new Street("Los", null, 0, 200, "Start", null, false);
        Player.Streets[1] = new Street("Opel", new int[]{2, 10, 30, 90, 160, 250}, 50, 60, "Street", new int[]{1, 3}, true);
        Player.Streets[2] = new Street("Gemeinschaftsfeld", null, 0, 0, "Gemeinschaftsfeld", null, false);
        Player.Streets[3] = new Street("Fiat", new int[]{4, 20, 60, 180, 320, 450}, 50, 60, "Street", new int[]{1, 3}, true);
        Player.Streets[4] = new Street("Blitzer", null, 0, 200, "Einkommenssteuer", null, false); //!!price
        Player.Streets[5] = new Street("Esso", new int[]{25, 50, 100, 200}, 0, 200, "Bahnhof", null, true); //!rent
        Player.Streets[6] = new Street("Skoda", new int[]{6, 30, 90, 270, 400, 550}, 50, 100, "Street", new int[]{6, 8, 9}, true);
        Player.Streets[7] = new Street("Ereignisfeld", null, 0, 0, "Ereignisfeld", null, false);
        Player.Streets[8] = new Street("Seat", new int[]{6, 30, 90, 270, 400, 550}, 50, 100, "Street", new int[]{6, 8, 9}, true);
        Player.Streets[9] = new Street("Toyota", new int[]{8, 40, 100, 300, 450, 600}, 50, 120, "Street", new int[]{6, 8, 9}, true);
        Player.Streets[10] = new Street("Gefängnis", null, 0, 0, "Gefängnis", null, false);
        Player.Streets[11] = new Street("Hyundai", new int[]{10, 50, 150, 450, 625, 750}, 100, 140, "Street", new int[]{11, 13, 14}, true);
        Player.Streets[12] = new Street("ATU", new int[]{4, 10}, 0, 150, "Werk", null, true); //!rent
        Player.Streets[13] = new Street("Peugeot", new int[]{10, 50, 150, 450, 625, 750}, 100, 140, "Street", new int[]{11, 13, 14}, true);
        Player.Streets[14] = new Street("Volvo", new int[]{12, 60, 180, 500, 700, 900}, 100, 160, "Street", new int[]{11, 13, 14}, true);
        Player.Streets[15] = new Street("Star", new int[]{25, 50, 100, 200}, 0, 200, "Bahnhof", null, true); //!rent
        Player.Streets[16] = new Street("Honda", new int[]{14, 70, 200, 550, 750, 950}, 100, 180, "Street", new int[]{16, 18, 19}, true);
        Player.Streets[17] = new Street("Gemeinschaftsfeld", null, 0, 0, "Gemeinschaftsfeld", null, false);
        Player.Streets[18] = new Street("Aston Martin", new int[]{14, 70, 200, 550, 750, 950}, 100, 180, "Street", new int[]{16, 18, 19}, true);
        Player.Streets[19] = new Street("Volkswagen", new int[]{16, 80, 220, 600, 800, 1000}, 100, 200, "Street", new int[]{16, 18, 19}, true);
        Player.Streets[20] = new Street("Frei Parken", null, 0, 0, "Frei Parken", null, false);
        Player.Streets[21] = new Street("Tesla", new int[]{18, 90, 250, 700, 875, 1050}, 150, 220, "Street", new int[]{21, 23, 24}, true);
        Player.Streets[22] = new Street("Ereignisfeld", null, 0, 0, "Ereignisfeld", null, false);
        Player.Streets[23] = new Street("Audi", new int[]{18, 90, 250, 700, 875, 1050}, 150, 220, "Street", new int[]{21, 23, 24}, true);
        Player.Streets[24] = new Street("BMW", new int[]{20, 100, 300, 750, 925, 1100}, 150, 240, "Street", new int[]{21, 23, 24}, true);
        Player.Streets[25] = new Street("Aral", new int[]{25, 50, 100, 200}, 0, 200, "Bahnhof", null, true); //!rent
        Player.Streets[26] = new Street("Bentley", new int[]{22, 110, 330, 800, 975, 1150}, 150, 260, "Street", new int[]{26, 27, 29}, true);
        Player.Streets[27] = new Street("Porsche", new int[]{22, 110, 330, 800, 975, 1150}, 150, 260, "Street", new int[]{26, 27, 29}, true);
        Player.Streets[28] = new Street("ADAC",  new int[]{4, 10}, 0, 150, "Werk", null, true); //!rent
        Player.Streets[29] = new Street("Roll Royce", new int[]{24, 120, 360, 850, 1025, 1200}, 150, 280, "Street", new int[]{26, 27, 29}, true);
        Player.Streets[30] = new Street("Gehen Sie in das Gefängnis", null, 0, 0, "Ins Gefängnis", null, false);
        Player.Streets[31] = new Street("Lamborghini", new int[]{26, 130, 390, 900, 1100, 1275}, 200, 300, "Street", new int[]{31, 32, 34}, true);
        Player.Streets[32] = new Street("Pagani", new int[]{26, 130, 390, 900, 1100, 1275}, 200, 300, "Street", new int[]{31, 32, 34}, true);
        Player.Streets[33] = new Street("Gemeinschaftsfeld", null, 0, 0, "Gemeinschaftsfeld", null, false);
        Player.Streets[34] = new Street("Ferrari", new int[]{28, 150, 450, 1000, 1200, 1400}, 200, 320, "Street", new int[]{31, 32, 34}, true);
        Player.Streets[35] = new Street("Shell", new int[]{25, 50, 100, 200}, 0, 200, "Bahnhof", null, true); //!rent
        Player.Streets[36] = new Street("Ereignisfeld", null, 0, 0, "Ereignisfeld", null, false);
        Player.Streets[37] = new Street("Koenigsegg", new int[]{35, 175, 500, 1100, 1300, 1500}, 200, 350, "Street", new int[]{37, 39}, true);
        Player.Streets[38] = new Street("Unfall", null, 0, 100, "Zusatzsteuer", null, false); //!price
        Player.Streets[39] = new Street("Bugatti", new int[]{50, 200, 600, 1400, 1700, 2000}, 200, 400, "Street", new int[]{37, 39}, true);

    }
}
