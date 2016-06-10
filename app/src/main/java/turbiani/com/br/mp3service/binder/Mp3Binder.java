package turbiani.com.br.mp3service.binder;

import android.os.Binder;

import turbiani.com.br.mp3service.interfaces.Mp3Service;

/**
 * Created by turbiani on 09/06/16.
 */
public class Mp3Binder extends Binder {
    private Mp3Service mServico;

    public Mp3Binder(Mp3Service mServico) {
        this.mServico = mServico;
    }

    public Mp3Service getServico() {
        return mServico;
    }
}
