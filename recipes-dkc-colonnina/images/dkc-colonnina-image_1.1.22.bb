SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "DKC colonnina project"
# LICENSE = "MIT"
LICENSE = "CLOSED"
SRC_URI = " file://DKC_COLONNINA.out.prck"

PR="r15"

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

RDEPENDS_${PN} = " serial2mqtt"

do_install () {
	install -d ${D}/opt/dsp_software
	install -m 0644 ${WORKDIR}/DKC_COLONNINA.out.prck ${D}/opt/dsp_software/
	install -m 0644 ${WORKDIR}/*.prck ${D}/opt/dsp_software/
}


# Path delle cartelle e dei file da installare nel pacchetto
PRCKFILE += "/opt/dsp_software/DKC_COLONNINA.out.prck"
FILES_${PN} += "${PRCKFILE}"

# ALLOW_EMPTY_{PN} = 1

pkg_postinst_ontarget_${PN}() {
    # 1: upgrade software command!
    count=2
    for i in $(seq $count); do
        /usr/bin/issue_command 1 ${PRCKFILE} > /dev/null 2>&1 || true
        # if [ $? -eq 0 ]; then break; fi
	# sleep 1
	# echo "issue_command failed.... [retry $i/$count]"
    done
    # if [ -z "$D" ]; then
    #     if type systemd-tmpfiles >/dev/null; then
    #         systemd-tmpfiles --create
    #     elif [ -e ${sysconfdir}/init.d/populate-volatile.sh ]; then
    #         ${sysconfdir}/init.d/populate-volatile.sh update
    #     fi
    # fi
}
