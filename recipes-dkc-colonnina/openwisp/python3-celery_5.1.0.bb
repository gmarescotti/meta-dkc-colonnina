
SUMMARY = "Distributed Task Queue."
HOMEPAGE = "http://celeryproject.org"
AUTHOR = "Ask Solem <auvipy@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=714ade8234d6e3ec5b162ab38f44cb9e"

SRC_URI = "https://files.pythonhosted.org/packages/c9/9e/9a5d6355e35db4bbdde89385df5fae17f8f954768b91a1d02d689bf68294/celery-5.1.0.tar.gz"
SRC_URI[md5sum] = "c5887c4b74a825b879fd08a494c0d630"
SRC_URI[sha256sum] = "65f061c04578cf189cd7352c192e1a79fdeb370b916bff792bcc769560e81184"

S = "${WORKDIR}/celery-5.1.0"

RDEPENDS_${PN} = "python3-pytz python3-billiard python3-kombu python3-vine python3-click python3-click-didyoumean python3-click-repl python3-click-plugins python3-setuptools"

inherit setuptools3
