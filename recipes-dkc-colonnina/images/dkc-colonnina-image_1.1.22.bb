SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "DKC colonnina project"
# LICENSE = "MIT"
LICENSE = "CLOSED"
SRC_URI = "file://DKC_COLONNINA.out.prck"

PR="r45"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*              DSP PRCK PACKAGE               *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build

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
