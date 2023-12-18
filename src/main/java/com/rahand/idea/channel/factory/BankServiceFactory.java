package com.rahand.idea.channel.factory;

import com.rahand.idea.channel.enums.BankName;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.Utils;
import com.rahand.idea.channel.wrapper.faraboom.FaraBoomService;
import com.rahand.idea.channel.wrapper.middleeast.MiddleEastService;
import com.rahand.idea.channel.wrapper.saman.SamanService;
import com.rahand.idea.channel.wrapper.tourism.TourismService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankServiceFactory {

    private Logger logger = LogUtils.getLogger();

    @Autowired
    private SamanService samanService;
    @Autowired
    private MiddleEastService middleEastService;
    @Autowired
    private TourismService tourismService;
    @Autowired
    private FaraBoomService faraBoomService;

    public <T> T getBankService(BankName bankName, Class<T> serviceType) {

        logger.info("********** in getBankService --- bank: {} and serviceType: {} **********", bankName.value(), serviceType.getSimpleName());

        if (bankName.name().startsWith("FARABOOM")) {
            if (Utils.isSubclassOfClassName(faraBoomService.getClass(), serviceType.getName())) {
                return (T) faraBoomService;
            } else {
                logger.error("There is no implementation for" + serviceType.getSimpleName() + "in Fara Boom");
                throw new RuntimeException("There is no implementation for" + serviceType.getSimpleName() + "inn Fara Boom");
            }
        } else if (bankName.equals(BankName.SAMAN)) {
            if (Utils.isSubclassOfClassName(samanService.getClass(), serviceType.getName())) {
                return (T) samanService;
            } else {
                logger.error("There is no implementation for" + serviceType.getSimpleName() + "in SAMAN bank");
                throw new RuntimeException("There is no implementation for" + serviceType.getSimpleName() + "in SAMAN bank");
            }
        } else if (bankName.equals(BankName.MIDDLE_EAST)) {
            if (Utils.isSubclassOfClassName(middleEastService.getClass(), serviceType.getName())) {
                return (T) middleEastService;
            } else {
                logger.error("There is no implementation for" + serviceType.getSimpleName() + "in MIDDLE_EAST bank");
                throw new RuntimeException("There is no implementation for" + serviceType.getSimpleName() + "in MIDDLE_EAST bank");
            }
        } else if (bankName.equals(BankName.TOURISM)) {
            if (Utils.isSubclassOfClassName(tourismService.getClass(), serviceType.getName())) {
                return (T) tourismService;
            } else {
                logger.error("There is no implementation for" + serviceType.getSimpleName() + "in Tourism bank");
                throw new RuntimeException("There is no implementation for" + serviceType.getSimpleName() + "in Tourism bank");
            }
        }

        logger.info("********** End getBankService --- bank: {} and serviceType: {} **********", bankName.value(), serviceType.getSimpleName());

        return null;
    }

}
