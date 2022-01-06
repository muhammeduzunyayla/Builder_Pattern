public class ASUSFactory extends PcFactory {

    @Override
    public RamAbstract CreateRam() {
        KıngstonRam kıngstonRam = new KıngstonRam("KıngstonRam");
        return kıngstonRam;
    }

    @Override
    public HDDAbstract CreateHdd() {
        SeagateHdd seagateHdd = new SeagateHdd("SeagateHdd");
        return seagateHdd;
    }
}
