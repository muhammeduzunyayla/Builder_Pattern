public class HPFactory extends PcFactory {

    @Override
    public RamAbstract CreateRam() {
        CorsairRam corsairRam = new CorsairRam("CorsairRam ");
        return corsairRam;
    }

    @Override
    public HDDAbstract CreateHdd() {
        WdHdd wdHdd = new WdHdd("WdHdd");
        return wdHdd;
    }
}
