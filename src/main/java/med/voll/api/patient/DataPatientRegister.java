package med.voll.api.patient;

import med.voll.api.address.DataAddress;

public record DataPatientRegister(String name, String email, String phone,
                                      String documentNumber, DataAddress address) {
}
