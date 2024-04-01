SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_INSTALL:append = " wpa-supplicant"
IMAGE_INSTALL:append = " wlconf"
IMAGE_INSTALL:append = " kernel-modules"
IMAGE_INSTALL:append = " linux-firmware"
IMAGE_INSTALL:append = " apt"
IMAGE_INSTALL:append = " git"
IMAGE_INSTALL:append = " nano"
IMAGE_INSTALL:append = " python3"
IMAGE_INSTALL:append = " python3-pip"
IMAGE_INSTALL:append = " python3-numpy"



DISTRO_FEATURES:append = " systemd"
DISTRO_FEATURES:append = " systemd-resolved"

hostname = "Linux4Space-BBW"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"

