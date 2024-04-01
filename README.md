# BBW ADCS Linux4Space

## Inicializace repozitáře

Repozitář obsahuje 4 subrepozitáře, pro jejiž inicializaci je nutné použítyto příkazy.

```
    git submodule init
    git submodule update
```

## Vytvoření Image
Pro Beaglebone-Wireless je připravena L4S image, kterou je možné sestavit pomocí:

```
    bitbake l4s-adcs-image
```
Po té co jsme si dali 4 kávy, tak je možné kouknout dokonzole, jestli se to dokončilo.

Na ./build/deploy-ti/images/beaglebone/l4s-adcs-image-beaglebone.rootfs.wic.xz je možné najít IMG, kterou si stáhněte k sobě, aby bylo možné vytvořit SD Card.

## Vytvoření SD Card
Pro vytvoření SD Card je provést následující příkazy:
``` 
    unxz CESTA_K_IMG.wic.xz
    dd if=CESTA_K_IMG.wic of=/dev/sda
    sync
```
Tyto příkazy vytvoří SD Card, která je schopná nabootovat.

### Nastavení Wi-fi
Pro nastavení Wi-fi je nutné vytvořit záznam v /etc/wpa_supplicant. Protože se to nikomu nechce psát, tak je možné použít příkaz wpa_passphrase. Tento příkaz vygeneruje záznam, který je nutný dát na poslední řádek /etc/wpa_supplicant. Pro propsání změn je nutný restart.