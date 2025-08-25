class LastFrameCache implements FrameCache {
    private Frame last;

    @Override
    public void save(Frame frame) {
        last = frame;
    }

    @Override
    public Frame load() {
        return last;
    }
}