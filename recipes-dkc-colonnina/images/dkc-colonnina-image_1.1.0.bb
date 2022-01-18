SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "DKC colonnina project"
# LICENSE = "MIT"
LICENSE = "CLOSED"
SRC_URI = " file://DKC_COLONNINA.out.prck"


python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*              DSP PRCK PACKAGE               *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build

# python3 addon packages versions
# per aiohttp
# IMAGE_INSTALL_append = " git-dev" 
# IMAGE_INSTALL_append += " python3-versions.inc"
# IMAGE_INSTALL_append += " python3-*.bb"
# IMAGE_INSTALL_append += " python3-djangorestframework"
## DEPENDS = "microchip-headless-image"
# RDEPENDS_${PN} = " dsp-prck"
# IMAGE_INSTALL_remove = " nodejs nodejs-npm greengrass"
# IMAGE_INSTALL_append += " qtbase qtbase-tools qtbase-plugins"
# IMAGE_INSTALL_append += " libavahi-gobject avahi-daemon libavahi-common libavahi-core libavahi-client avahi-dnsconfd libavahi-glib avahi-autoipd avahi-utils"
# IMAGE_INSTALL_append += " qtscxml"

do_install () {
	install -d ${D}/opt/dsp_software
	install -m 0644 ${WORKDIR}/DKC_COLONNINA.out.prck ${D}/opt/dsp_software/
	install -m 0644 ${WORKDIR}/*.prck ${D}/opt/dsp_software/
}


# Path delle cartelle e dei file da installare nel pacchetto
FILES_${PN} += "/opt/dsp_software/DKC_COLONNINA.out.prck"

# ALLOW_EMPTY_{PN} = 1

pkg_postinst_${PN}() {
    # 1: upgrade software command!
    /usr/bin/issue_command 1
    # if [ -z "$D" ]; then
    #     if type systemd-tmpfiles >/dev/null; then
    #         systemd-tmpfiles --create
    #     elif [ -e ${sysconfdir}/init.d/populate-volatile.sh ]; then
    #         ${sysconfdir}/init.d/populate-volatile.sh update
    #     fi
    # fi
}
