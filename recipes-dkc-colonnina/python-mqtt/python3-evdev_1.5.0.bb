
SUMMARY = "Bindings to the Linux input handling subsystem"
HOMEPAGE = "https://github.com/gvalkov/python-evdev"
AUTHOR = "Georgi Valkov <georgi.t.valkov@gmail.com>"
LICENSE = "BSD License"
LIC_FILES_CHKSUM = "file://LICENSE;md5=18debddbb3f52c661a129724a883a8e2"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/47/f0/650d83c84386d4a79e91e5c826f4ea10315c0708ea784e79c1b67e18bf26/evdev-1.5.0.tar.gz"
SRC_URI[md5sum] = "3fc7c0d0fcd3382fdd3a1a52f1017023"
SRC_URI[sha256sum] = "5b33b174f7c84576e7dd6071e438bf5ad227da95efd4356a39fe4c8355412fe6"

S = "${WORKDIR}/evdev-1.5.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
