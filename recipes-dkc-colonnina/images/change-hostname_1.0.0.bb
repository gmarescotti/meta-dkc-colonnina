# set ft=bash

SUMMARY = "change name of wallbox"
DESCRIPTION = "change both hosts and hostname files, and then apply"
LICENSE = "CLOSED"
SRC_URI = "file://change_name.sh"

RDEPENDS_${PN} += " bash "

PR="0"

pkg_postinst_ontarget_${PN}() {
	/usr/bin/change_name.sh
}

python do_display_banner() {
}

addtask display_banner before do_build

do_install () {
	install -d ${D}/usr/bin
	install -m 0755 ${WORKDIR}/change_name.sh ${D}/usr/bin/
}

# Path delle cartelle e dei file da installare nel pacchetto
FILES_${PN} += "/usr/bin/change_name.sh"

