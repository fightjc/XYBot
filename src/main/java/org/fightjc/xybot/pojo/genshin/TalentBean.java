package org.fightjc.xybot.pojo.genshin;

import java.util.List;
import java.util.Map;

public class TalentBean {
    String name;
    TalentCombatBean combat1;
    TalentCombatBean combat2;
    TalentCombatBean combat3;
    TalentCombatBean combatsp;
    TalentPassiveBean passive1;
    TalentPassiveBean passive2;
    TalentPassiveBean passive3;
    Map<String, List<CostBean>> costs;

    public TalentBean(String name, TalentCombatBean combat1, TalentCombatBean combat2, TalentCombatBean combat3,
                      TalentCombatBean combatsp, TalentPassiveBean passive1, TalentPassiveBean passive2,
                      TalentPassiveBean passive3, Map<String, List<CostBean>> costs) {
        this.name = name;
        this.combat1 = combat1;
        this.combat2 = combat2;
        this.combat3 = combat3;
        this.combatsp = combatsp;
        this.passive1 = passive1;
        this.passive2 = passive2;
        this.passive3 = passive3;
        this.costs = costs;
    }
}
