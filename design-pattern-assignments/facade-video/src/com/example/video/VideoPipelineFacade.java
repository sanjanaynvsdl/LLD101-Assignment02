package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {

    private final Decoder dec;
    private final FilterEngine fe;
    private final Encoder enc;

    public VideoPipelineFacade() {
        this.dec = new Decoder();
        this.fe = new FilterEngine();
        this.enc = new Encoder();
    }

    public Path process(Path src, Path output, boolean gray,  double scale) {
        Frame[] frames = dec.decode(src);
        //handle only true, 
        frames = fe.grayscale(frames);

        //check scale, 
        frames = fe.scale(frames, scale);

        Path out = enc.encode(frames, output);
        return out;
    }
}
