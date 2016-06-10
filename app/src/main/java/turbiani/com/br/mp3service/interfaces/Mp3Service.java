package turbiani.com.br.mp3service.interfaces;

/**
 * Created by turbiani on 09/06/16.
 */
public interface Mp3Service {
    void play(String arquivo);
    void pause();
    void stop();
    String getMusicaAtual();
    int getTempoTotal();
    int getTempoDecorrido();
}
