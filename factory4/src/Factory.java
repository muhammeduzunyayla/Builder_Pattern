public class Factory {
    public PcFactory _pcFctory;
    public HDDAbstract _hddAbstract;
    public RamAbstract _ramAbstract;

    public Factory(PcFactory _pcFctory) {
        this._pcFctory = _pcFctory;
        _hddAbstract = _pcFctory.CreateHdd();
        _ramAbstract = _pcFctory.CreateRam();
    }

    public void Birlestir() {
        System.out.println();
        _hddAbstract.hddIslem();
        _ramAbstract.RamIslem();
    }

}
