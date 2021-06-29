
SUMMARY = "Messaging library for Python."
HOMEPAGE = "https://kombu.readthedocs.io"
AUTHOR = "Ask Solem <auvipy@gmail.com, ask@celeryproject.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=daea7c168428449fbee05e644df929f4"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/de/e1/0410ca7f47494c979b7d479884eb36c36feec45af3b0dfc050c3611a0a85/kombu-5.1.0.tar.gz"
SRC_URI[md5sum] = "d5b173352cce571a49d0b08c6019747f"
SRC_URI[sha256sum] = "01481d99f4606f6939cdc9b637264ed353ee9e3e4f62cfb582324142c41a572d"

S = "${WORKDIR}/kombu-5.1.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-amqp python3-vine"

BBCLASSEXTEND = "native nativesdk"
