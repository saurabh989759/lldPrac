package SystemDesign.BookMyShow.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Payment extends BaseModel{
    private String referenceNumber ;
    private int amount ;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
}
