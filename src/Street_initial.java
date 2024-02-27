public class Street_initial {
    public static void main(String[] args){
        int[] a = new int[0];
        Player.Streets[0] = new Street("Los", a, 0, 200, "Start", a);
        Player.Streets[1] = new Street("Badstraße", new int[]{2, 10, 30, 90, 160, 250}, 50, 60, "Street", new int[]{1, 3});
        Player.Streets[2] = new Street("Gemeinschaftsfeld", a, 0, 0, "Gemeinschaftsfeld", a);
        Player.Streets[3] = new Street("Turmstraße", new int[]{4, 20, 60, 180, 320, 450}, 50, 60, "Street", new int[]{1, 3});
        Player.Streets[4] = new Street("Einkommenssteuer", a, 0, 200, "Einkommenssteuer", a);
        Player.Streets[5] = new Street("Südbahnhof", new int[]{25, 50, 100, 200}, 0, 200, "Bahnhof", a);
        Player.Streets[6] = new Street("Chausseestraße", new int[]{6, 30, 90, 270, 400, 550}, 50, 100, "Street", new int[]{6, 8, 9});
        Player.Streets[7] = new Street("Ereignisfeld", a, 0, 0, "Ereignisfeld", a);
    }

    public static void streetInitial (){
        int[] a = new int[0];
        Player.Streets[0] = new Street("Los", a, 0, 200, "Start", a);
        Player.Streets[1] = new Street("Badstraße", new int[]{2, 10, 30, 90, 160, 250}, 50, 60, "Street", new int[]{1, 3});
        Player.Streets[2] = new Street("Gemeinschaftsfeld", a, 0, 0, "Gemeinschaftsfeld", a);
        Player.Streets[3] = new Street("Turmstraße", new int[]{4, 20, 60, 180, 320, 450}, 50, 60, "Street", new int[]{1, 3});
        Player.Streets[4] = new Street("Einkommenssteuer", a, 0, 200, "Einkommenssteuer", a);
        Player.Streets[5] = new Street("Südbahnhof", new int[]{25, 50, 100, 200}, 0, 200, "Bahnhof", a);
        Player.Streets[6] = new Street("Chausseestraße", new int[]{6, 30, 90, 270, 400, 550}, 50, 100, "Street", new int[]{6, 8, 9});
        Player.Streets[7] = new Street("Ereignisfeld", a, 0, 0, "Ereignisfeld", a);
    }
}
