package org.college.practice2.task1.task1_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Platform {
        private static Map<String, Platform> _instances = new HashMap<>();
        private List<Portfolio> _portfolios;
        private String _name;
        private String _announcement;

        public Platform(String name) {
            this._name = name;
            this._portfolios = new ArrayList<>();
        }

        public static Platform getInstance(String name) {
            return _instances.computeIfAbsent(name, Platform::new);
        }

        public boolean addPortfolio(Portfolio portfolio) {
            return _portfolios.add(portfolio);
        }

        public String describePortfolio(Portfolio portfolio) {
            return portfolio.toString();
        }

        public List<Portfolio> getPortfolios() {
            return new ArrayList<>(_portfolios);
        }

        public long getPortfolioCount() {
            return _portfolios.size();
        }

        public String getName() {
            return _name;
        }

        public void setAnnouncement(String announcement) {
            this._announcement = announcement;
        }

        public String getAnnouncement() {
            return _announcement;
        }
    }
