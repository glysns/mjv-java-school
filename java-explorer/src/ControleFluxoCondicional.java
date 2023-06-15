public class ControleFluxoCondicional {
    public static void main(String[] args) {
        Plano plano = Plano.TURBO;

        switch (plano) {
            case TURBO: {
                System.out.println("5Gb Youtube");
            }
            case MIDIA: {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case BASIC: {
                System.out.println("100 minutos de ligação");
            }
        }

    }
}
