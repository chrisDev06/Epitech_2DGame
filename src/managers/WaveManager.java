package managers;

import java.util.ArrayList;
import java.util.Arrays;

import events.Wave;
import scenes.Playing;

public class WaveManager {

    private Playing playing;
    private ArrayList<Wave> waves = new ArrayList<>();

    private int enemySpawnTickLimit = 60 * 1;
    private int enemySpawnTick = enemySpawnTickLimit;
    private int enemyIndex, waveIndex;

    public WaveManager(Playing playing) {
        this.playing = playing;
        createWaves();
    }

    public void update() {
        if (enemySpawnTick < enemySpawnTickLimit) {
            enemySpawnTick++;
        }
    }

    public int getNextEnemy() {
        enemySpawnTick = 0;
        if (isThereMoreEnemiesInWave()) {
            return waves.get(waveIndex).getEnemyList().get(enemyIndex++);
        } else {
            return -1; // or throw new IllegalStateException("No more enemies in the wave");
        }
    }

    private void createWaves() {
        waves.add(new Wave(new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 0, 1, 2, 3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1))));
    }

    public ArrayList<Wave> getWaves() {
        return waves;
    }

    public boolean isTimeForNewEnemy() {
        return enemySpawnTick >= enemySpawnTickLimit;
    }

    public boolean isThereMoreEnemiesInWave() {
        return enemyIndex < waves.get(waveIndex).getEnemyList().size();

    }   

}
