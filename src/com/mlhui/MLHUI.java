package com.mlhui;

import com.mlhui.component.Taxonomy;
import com.mlhui.component.dataset.DataSet;

import java.util.HashMap;
import java.util.Map;

public class MLHUI {
    private DataSet dataSet = new DataSet();
    private Taxonomy taxonomy;
    private Map<Integer, Double> mapItemToRecency = new HashMap<>();
    private Map<Integer, Integer> mapItemToFrequency= new HashMap<>();
    private Map<Integer, Double> mapItemToMonetary = new HashMap<>();
    private Map<Integer, Integer> mapItemToTWU = new HashMap<>();


    public MLHUI() {
    }

    public MLHUI(DataSet dataSet, Taxonomy taxonomy, Map<Integer, Double> mapItemToRecency, Map<Integer, Integer> mapItemToFrequency, Map<Integer, Double> mapItemToMonetary, Map<Integer, Integer> mapItemToTWU) {
        this.dataSet = dataSet;
        this.taxonomy = taxonomy;
        this.mapItemToRecency = mapItemToRecency;
        this.mapItemToFrequency = mapItemToFrequency;
        this.mapItemToMonetary = mapItemToMonetary;
        this.mapItemToTWU = mapItemToTWU;
    }

    public DataSet getDataSet() {
        return dataSet;
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public Taxonomy getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(Taxonomy taxonomy) {
        this.taxonomy = taxonomy;
    }

    public Map<Integer, Double> getMapItemToRecency() {
        return mapItemToRecency;
    }

    public void setMapItemToRecency(Map<Integer, Double> mapItemToRecency) {
        this.mapItemToRecency = mapItemToRecency;
    }

    public Map<Integer, Integer> getMapItemToFrequency() {
        return mapItemToFrequency;
    }

    public void setMapItemToFrequency(Map<Integer, Integer> mapItemToFrequency) {
        this.mapItemToFrequency = mapItemToFrequency;
    }

    public Map<Integer, Integer> getMapItemToTWU() {
        return mapItemToTWU;
    }

    public void setMapItemToTWU(Map<Integer, Integer> mapItemToTWU) {
        this.mapItemToTWU = mapItemToTWU;
    }

    public Map<Integer, Double> getMapItemToMonetary() {
        return mapItemToMonetary;
    }

    public void setMapItemToMonetary(Map<Integer, Double> mapItemToMonetary) {
        this.mapItemToMonetary = mapItemToMonetary;
    }
}
