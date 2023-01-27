DESCRIPTION = "DKC Production Image"
LICENSE = "MIT"

require recipes-atmel/images/microchip-headless-image.bb

inherit extrausers

EXTRA_USERS_PARAMS += " \
	usermod -P root root; \
"

IMAGE_INSTALL_remove += " debug-tweaks "

